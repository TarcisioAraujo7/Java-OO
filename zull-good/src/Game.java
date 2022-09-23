/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room casa, arraia, mar_aberto, tubarao, minas, canion, tartaruga, agua_viva, sidney;
      
        // create the rooms
        casa = new Room("na sua casa mas não sabe onde o Nemo está");
        arraia = new Room("onde o Nemo estuda, mas ele tambem não esta aqui");
        mar_aberto = new Room("no mar aberto e encontrou uma peixe chamada Dori! Ela irá te acompanhar agora!");
        tubarao = new Room("onde assustadores tubarões vivem");
        minas = new Room("em um lugar perigoso");
        canion = new Room("em um canion escuro e perigoso, cuidado!");
        tartaruga = new Room("em uma corrente maritima com as tartarugas! Você ainda não encontrou o Nemo");
        agua_viva = new Room("junto com as aguas-vivas. Muito cuidado!");
        sidney = new Room("COM O NEMO, PARABENS! 🥳");

        
        // initialise room exits
        casa.setExit("north", arraia);

        arraia.setExit("west", mar_aberto);
        arraia.setExit("south", casa);
        arraia.setExit("north", tubarao);

        mar_aberto.setExit("east", arraia);
        mar_aberto.setExit("north", tubarao);

        tubarao.setExit("east", minas);
        tubarao.setExit("north", canion);

        canion.setExit("north", agua_viva);
        canion.setExit("west", tartaruga);

        tartaruga.setExit("south", canion);
        tartaruga.setExit("east", agua_viva);

        agua_viva.setExit("south", canion);
        agua_viva.setExit("west", tartaruga);
        agua_viva.setExit("north", sidney);

        currentRoom = casa;  // start game outside
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Obrigado por jogar.  Até mais.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Bem vindo ao Procurando Nemo!");
        System.out.println("Procurando Nemo definitivamente é um jogo de procurar o Nemo.");
        System.out.println("Digite 'help' se precisa de ajuda.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("Não entendi...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }
        // else command not recognised.
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        
        System.out.println("Seus comandos são:");
        parser.showCommands();
    }

    /** 
     * Try to in to one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
}
