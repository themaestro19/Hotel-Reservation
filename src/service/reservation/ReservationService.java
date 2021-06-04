package service.reservation;

import model.reservation.Reservation;
import model.room.IRoom;

import java.util.HashMap;
import java.util.Map;

public class ReservationService {

    private static final ReservationService SINGLETON = new ReservationService();
    private static final int RECOMMENDED_ROOMS_DEFAULT_PLUS_DAYS = 7;
    private final Map<String, IRoom> rooms = new HashMap<>();

}
