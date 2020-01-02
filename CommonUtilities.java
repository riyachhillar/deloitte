package room;

public class CommonUtilities {
	public static boolean validateRoomId(int roomId) {
String str = String.valueOf(roomId);
		String pattern = "^[0-9]{4}$";
		
		if(str.matches(pattern))
			return true;
		else 
			return false;
		
	}

}
