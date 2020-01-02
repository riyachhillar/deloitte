package room;

import java.util.*;

public class ImplementRoom implements roomManagement{

	@Override
	public ClassRoom addRooms(String name, int classId,int noOfSystem,
			boolean projector, boolean ac, String faculty) {
		// TODO Auto-generated method stub

		ClassRoom obj = new ClassRoom();
		obj.setName(name);
		obj.setClassId(classId);
		obj.setNoOfSystem(noOfSystem);
		obj.setProjector(projector);
		obj.setAc(ac);
		obj.setFaculty(faculty);
		obj.setAvailabilty(true);
		return obj;
	}

	@Override
	public int searchRoomId(int roomId,  ArrayList<ClassRoom> objects) {
		int flag = 0;
		for(ClassRoom p : objects)
		{if (roomId==p.getClassId())
			 flag =  1;
		
		}

		if(flag == 1)
		return roomId;
		else return 0;
		// TODO Auto-generated method stub

		
		
	}

	@Override
	public boolean allocateRoom(int min, String fname,  ArrayList<ClassRoom> objects ) {
		// TODO Auto-generated method stub
		boolean roomAvail  = false;
		
		for(ClassRoom x : objects)
		{
			if(min <= x.getNoOfSystem() && x.isAvailabilty()) {
		
			x.setAvailabilty(false);
			x.setFaculty(fname);
			roomAvail = true;
			}
			
			
		}
		return roomAvail;
		
	}

	@Override
	public ClassRoom[] displayRooms() {
		// TODO Auto-generated method stub
		return null;
	}

		

	
		

	@Override
	public boolean loginId(String username, String password) {
		// TODO Auto-generated method stub
		ClassRoom a = new ClassRoom();
		if(username.equals("admin") && password.equals("admin") )
			{
			
			a.setUsername(username);
			a.setPassword(password);
			return true;
			}
		    
		else 
			{
		return false;}
		
	}



}