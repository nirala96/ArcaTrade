import java.util.*;

import java.io.*;

 

public class auction {

 

    //declaring global variables

 

    public static int ownercount=0,playercount=0,counter=0;  

    

    public static Player player[] = new Player[100];

    

    public static Owner owner[] = new Owner[100];

    

    public static String player_name,game_tag,wep1,wep2;

    

    public static int player_rank,hour;

    

    public static String owner_name,ph;

    

    public static int registration_number;

    

    public static String name[]=new String[100];

    

    public static String nameo[]=new String[100];

    

    public static String phone[]=new String[100];

    

    public static String gt[]=new String[100];

    

    public static String pw[]=new String[100];

    

    public static String sw[]=new String[100];

    

    public static int ownercountmembers[]=new int[100];

    

    public static int x=1,y;

 

 

    public static void welcome(){

       

        try{

            

            Scanner sc = new Scanner(System.in);

            System.out.println("\n**** SELECT ANY ONE ****");

                System.out.println();

                System.out.println("    1. Player Registration. ");

                System.out.println("    2. Owner Registration. ");

                System.out.println("    3. Auction Panel. ");

                System.out.println(); 

                System.out.print("ENTER YOUR NUMBER: ");

                

                int temp=sc.nextInt();

                

                

                if(temp == 1)

                {

                   Player obj=new Player();

                   name[playercount]=obj.getinfo();

                   gt[playercount]=obj.getinfog();

                   pw[playercount]=obj.getinfop();

                   sw[playercount]=obj.getinfos();

 

                        playercount++;

                        welcome();

                }

 

                if(temp == 2)

                {

                    Owner objj=new Owner();

                    nameo[ownercount]=objj.getinfoo();

                    phone[ownercount]=objj.getinfop();

 

                        ownercount++;

                        welcome();

                }

                

                if(temp == 3)

                {

                    Auction_Panel panel = new Auction_Panel();

 

                    panel.start(name,gt,pw,sw,nameo,phone);

                    

                }

            }

            catch(Exception e){

                System.out.println("An exception ocurred while Scanning");

            }

                

    }

 

    public static void main(String[] args){

        try{

        Scanner sc = new Scanner(System.in);

 

        

        System.out.print("\033[H\033[2J");  

        System.out.flush();

        //welcome msg

 

        System.out.println("\n\n\n");                   

        System.out.println("******");

        System.out.println();

        System.out.println("Welcome to Arcadia Auction System");

        System.out.println();

        System.out.println("******");

        System.out.println();

 

        int t = 0;

 

        System.out.println("  press 1 to continue    \n\n");

        int press = sc.nextInt();

        

        

        if(press == 1)

        {

            while(t == 0)

            {

                

                welcome();

 

            }

 

        }

        }

        catch(Exception e){

            System.out.println("An exception ocurred while Scanning");

        }

        

    }

    

}

////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////

 

class Auction_Panel extends auction{

 

    public void start(String name[],String gt[],String pw[],String sw[],String nameo[],String phone[])

    {

        try{

        

        Scanner sc = new Scanner(System.in);

 

        System.out.println("\n\n***WELCOME TO THE AUCTION PANEL**");

        System.out.println("\n\n*SELECT ANY ONE*");

        System.out.println("    1. view players.");

        System.out.println("    2. view owners.");

        System.out.println("    3. start bidding");

        System.out.print("Enter your choice: ");

        int panel_choice = sc.nextInt();

 

        if(panel_choice == 1)

        {   

            System.out.println("\n\nnumber of players registered till now are: "+playercount);

 

            for(int i=0;i<playercount;i++)

            {

                System.out.println("player name "+(i+1)+" = "+name[i]);

                System.out.println("gamer tag "+gt[i]);

                System.out.println("Primary Weapon "+pw[i]);

                System.out.println("Secondar weapon "+sw[i]);

                System.out.print("\n\n");

                

            }

            System.out.print("--------------------------------------------------");

 

            start(name,gt,pw,sw,nameo,phone);

        }

 

 

        if(panel_choice == 2)

        {

            System.out.println("\n\nnumber of owners registered till now are: "+ownercount);

            for(int i=0;i<ownercount;i++)

            {

                System.out.println("owner name "+(i+1)+" = "+nameo[i]);

                System.out.println("phone no.  "+phone[i]);

                System.out.print("\n\n");

                

            }

            System.out.print("--------------------------------------------------");

            start(name,gt,pw,sw,nameo,phone);

            

        }

 

        if(panel_choice == 3)

        {

            System.out.println("\n\npress 1 to go back");

            System.out.println("\n\npress 2 to go forward");

 

            int back_1 = sc.nextInt();

            if(back_1 == 1)

                start(name,gt,pw,sw,nameo,phone);

 

            if(back_1 == 2)

            {

                System.out.println("\n\n\n number of players registered till now are: "+playercount);

                System.out.println("\n\n\n number of owners are: "+ownercount);

                int credits[]=new int[ownercount];

                for(int i=0;i<ownercount;i++)

                    {

                        credits[i]=200;

                    }

                    for(int i=0;i<ownercount;i++)

                    {

                        ownercountmembers[i]=0;

                    }

       

                int y=1;

                    while(y==1)

                    {

                        System.out.println("\n\nEnter your choice");

                        System.out.println("1 to begin/continue");

                        System.out.println("2 to exit");

                        int c=sc.nextInt();

                        if(c==2)

                        {

                            System.exit(0);

                        }

                        if(c==1)

                        {

                        

                            begin(credits,name,gt,pw,sw,nameo,phone);

                        }

                    }

    

            }

        }

    }

    catch(Exception e){

        System.out.println("An exception ocurred while Scanning");

    } 

 

    }

    public static void begin(int credits[],String name[],String gt[],String pw[],String sw[],String nameo[],String phone[])

    {

        try{

        Scanner sc=new Scanner(System.in);

        

        if(x>playercount)

        {

            System.out.println("\nTeam no. = credits - no of players");

            for(int i=0;i<ownercount;i++)

                {

                System.out.println(i+1+" = "+credits[i]+" - "+ownercountmembers[i]);

                }

            System.out.println("\n No more players left for auction ");

            System.out.println("\n Thanku for the participating in the auction \n");

            System.exit(0);

        }

        System.out.println("\nTeam no. = credits");

        for(int i=0;i<ownercount;i++)

        {

            System.out.println(i+1+" = "+credits[i]);

        }

        System.out.println("Press 1 to call the next player");

        int ww=sc.nextInt();

        if(ww==1)

        {

        System.out.println("\nWe have player no "+x);

        System.out.println("player = "+name[x-1]);

        System.out.println("gamer tag "+gt[x-1]);

        System.out.println("Primary Weapon "+pw[x-1]);

        System.out.println("Secondar weapon "+sw[x-1]);

        System.out.println("Enter bid");

        int q=sc.nextInt();

        System.out.println("Enter Team");

        int w=sc.nextInt();

        for(int i=0;i<ownercount;i++)

        {

            y=0;

            if(i+1==w){

                if(credits[i]>=w)

                {

                credits[i]=credits[i]-q;

                y++;

                ownercountmembers[i]=ownercountmembers[i]+y;

                }

                else

                System.out.println("Insufficient credits");

            }

 

        }

        x++;

        begin(credits,name,gt,pw,sw,nameo,phone);

        }

        else

        {

            System.out.println("Invalid entry");

            begin(credits,name,gt,pw,sw,nameo,phone);

 

        }

    }

    catch(Exception e){

        System.out.println("An exception ocurred while Scanning");

    }

    }

 

}

 

 

 

///////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////

 

class Player extends auction{

    Scanner sc=new Scanner(System.in);

 

    

 

    public Player()

    {

        player_name = "";

        game_tag = "";

        wep1 = "";

        wep2 = "";

        player_rank = 0;

        hour = 0;

    }

 

    public String getinfo()

    {

        

        System.out.print("Enter your name: ");

        

        player_name = sc.nextLine();

        

        return player_name;

        

    }  

    public String getinfog()

    {

 

        System.out.print("Enter your gamer tag: ");

        

        game_tag = sc.nextLine();

        

        return game_tag;

        

    }  

    public String getinfop()

    {

 

        System.out.print("Enter your primary weapon: ");

        

        wep1 = sc.nextLine();

        

        return wep1;

        

    }  

    public String getinfos()

    {

        

        System.out.print("Enter your secondary weapon: ");

        

        wep2 = sc.nextLine();

        

        return wep2;

        

    }

 

 

}

 

////////////////////////////////////////////////////////////

/////////////////////////////////////////////////

class Owner extends auction{

    Scanner sc=new Scanner(System.in);

 

    

 

    public Owner()

    {

        owner_name = "";

        ph = "";

    }

 

    public String getinfoo()

    {

        

        System.out.print("Enter your name: ");

        owner_name = sc.nextLine();

        return owner_name;

    }

    public String getinfop()

    {

        

        System.out.print("Enter your phone no : ");

        ph = sc.nextLine();

        return ph;

    }

}

 

 

/////////////////////////////////////////////////////////

///////////////////////////////////////////////////////

