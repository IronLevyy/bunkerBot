package room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
    private List<Room> rooms = new ArrayList<>();
    private static int idRoom = 1;
    public void createRoom() {
        Room newRoom = new Room(idRoom);
        idRoom++;
    }
}
