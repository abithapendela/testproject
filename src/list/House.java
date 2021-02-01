package list;

public class House {
	String wnd;
	String doors;
	String rooms;
	
	//constructor
	
	House(String window, String door, String room){
		this.wnd = window;
		doors = door;
		rooms = room;
	}
	
	public String getWnd() {
		return wnd;
	}
	public void setWnd(String wnd) {
		this.wnd = wnd;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getRooms() {
		return rooms;
	}
	public void setRooms(String rooms) {
		this.rooms = rooms;
	}
	
	

}
