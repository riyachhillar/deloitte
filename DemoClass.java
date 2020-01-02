package room;

import java.util.*;


public class DemoClass extends ImplementRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 ArrayList<ClassRoom> objects = new ArrayList<ClassRoom>();
		while (true) {
			System.out.println("Please enter option 1 to add new room");
			System.out.println("option 2 to search the room ");
			System.out.println("option 3 to allocate room");
			System.out.println("option 4 to display all rooms");
			System.out.println("option 5 to exit the application");
			System.out.println("option 6 to login ");
			String option = sc.next();
			ImplementRoom mainObj = new ImplementRoom();

			switch (option) {
			case "1":
				int rooms;
				System.out.println("Enter total number of rooms");

				rooms = sc.nextInt();
             
				for (int i = 0; i < rooms; i++) {
					System.out.println("Enter name : ");
					String name = sc.next();
					int classId;
					while(true) {
						System.out.println("Enter room id : ");
						
						classId = sc.nextInt();
						
						boolean res = CommonUtilities.validateRoomId(classId);
						if(res)
							break;
						else
							continue;
					
					}
					System.out.println("Enter no of systems : ");
					int noOfSystem = sc.nextInt();
					System.out.println("Enter if projector needed (T/F) : ");
					boolean projector = sc.nextBoolean();
					System.out.println("Enter if AC needed (T/F) : ");
					boolean ac = sc.nextBoolean();
					System.out.println("Enter name of faculty : ");
					String faculty = sc.next();
					objects.add(mainObj.addRooms(name, classId, noOfSystem,
							projector, ac, faculty));
					
					
				}
				
				break;
				
			case "2" : 
			System.out.println("Enter classid to search details");
			int ch=sc.nextInt();
			int result = mainObj.searchRoomId(ch,objects);
			if(result!=0)
				System.out.println("Room " + result +" Found" );
			else 
				System.out.println("Room Not Found" );
			


				break;
			
			
			case "3" : 
			 	System.out.println("Enter minimum number of systems");
			int min  = sc.nextInt();
			int counter=0;
		
			System.out.println("Enter number of rooms required");
			int roomReq =sc.nextInt();
			String facultyName = "";
				System.out.println("Enter faculty name");
				facultyName = sc.next();
				for(ClassRoom ab : objects)
				{boolean res = mainObj.allocateRoom(min, facultyName, objects);
				
				if(res == true)
					++counter;
				
				if(roomReq > counter) {
					System.out.println("Sorry! Not enough rooms available for you");
					ab.setAvailabilty(true);
					ab.setFaculty("NA");
				}
				else {
					
					System.out.println(counter + " rooms are available for you");
				}}
			break;

			case "4":
				System.out.println("");
				for (ClassRoom i : objects)
					System.out.println(i);
				System.out.println("");
				System.out.println("No of rooms " + ClassRoom.getCount());
				
				break;

			case "5":
				System.out.println("terminated");
				System.exit(0);
				break;
			case "6" :
				System.out.println("Enter username");
				String user =sc.next();
				System.out.println("Enter password");
				String pass = sc.next();
				boolean ans = mainObj.loginId(user, pass);
				if(ans)
					System.out.println("Login successful");
				else 
					System.out.println("Username or password incorrect ");
					
			}
			ClassRoom.getCount();

		}
	

	}
}
