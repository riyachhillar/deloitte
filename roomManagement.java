package room;

import java.util.ArrayList;

public interface roomManagement {
	public ClassRoom addRooms(String name, int classId,int noOfSystem,
			boolean projector, boolean ac, String faculty);
	public  int searchRoomId(int roomId, ArrayList<ClassRoom> objects);
	public boolean allocateRoom(int min, String fname,  ArrayList<ClassRoom> objects);
	public ClassRoom[] displayRooms();
	public boolean loginId(String username,String password);

}
