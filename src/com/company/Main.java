package com.company;

public class Main {

    public static void main(String[] args) {
        PlaneReservation planReservationimpl=new PlaneReservationimpl();
        System.out.println(planReservationimpl.reservation(PlaneReservation.PlaceType.STANDARD,"JA",800).get());
        System.out.println(planReservationimpl.cancel(1).get());
        System.out.println(planReservationimpl.reservation(PlaneReservation.PlaceType.STANDARD,"JA1",800).get());
        System.out.println(planReservationimpl.reservation(PlaneReservation.PlaceType.STANDARD,"JA2",800).get());
        System.out.println(planReservationimpl.reservation(PlaneReservation.PlaceType.STANDARD,"JA3",800).get());
        System.out.println(planReservationimpl.reservation(PlaneReservation.PlaceType.STANDARD,"JA4",800).get());
        System.out.println(planReservationimpl.reservation(PlaneReservation.PlaceType.STANDARD,"JA5",800).get());
        System.out.println(planReservationimpl.reservation(PlaneReservation.PlaceType.STANDARD,"JA6",800).get());
        System.out.println(planReservationimpl.reservation(PlaneReservation.PlaceType.STANDARD,"JA7",800).get());
        System.out.println("Places");
        for(Place place:planReservationimpl.reservcedPlaces()){

            if(place.getUsername()!=null) {
                System.out.println(place.getUsername());
            }
        }
        planReservationimpl.changePlaces(1,2);
        System.out.println("Free Places");
        for(Place place:planReservationimpl.freePlaces()){
            System.out.println(place.getId());
        }
        System.out.println("Reserved Place");
        for(Place place:planReservationimpl.reservcedPlaces()){
            System.out.println(place.getId());
        }
        System.out.println("Places");
        for(Place place:planReservationimpl.reservcedPlaces()){
            if(place.getUsername()!=null) {
                System.out.println(place.getUsername());
            }
        }
        System.out.println("Money:");
        System.out.println(planReservationimpl.status());

    }
}
