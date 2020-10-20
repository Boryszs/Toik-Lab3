package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlaneReservationimpl implements PlaneReservation {

    private List<Place> places;
    private int money;

    public PlaneReservationimpl() {
        places=new ArrayList<>(128);
        for(int count=0;count<=128;count++){
            if(count<=100) {
                places.add(new Place(count,null, PlaceType.STANDARD));
            }else{
                places.add(new Place(count,null, PlaceType.VIP));
            }
        }
    }


    @Override
    public Optional<Integer> reservation(PlaceType placeType, String username, int price) {
        for(Place place:places){
            if(place.getPlaceType()==placeType && place.getUsername()==null){
                if(PlaceType.STANDARD==placeType && price==800){
                    place.setUsername(username);
                    places.set(place.getId(),place);
                    money+=price;
                    return Optional.of(place.getId());
                }else if(PlaceType.VIP==placeType && price==1200){
                    place.setUsername(username);
                    places.set(place.getId(),place);
                    money+=price;
                    return Optional.of(place.getId());
                }
            }
        }
        return null;
    }

    @Override
    public Optional<Integer> cancel(int placeId) {
        return Optional.empty();
    }

    @Override
    public int status() {
        return 0;
    }

    @Override
    public List<Place> freePlaces() {
        return null;
    }

    @Override
    public List<Place> reservcedPlaces() {
        return null;
    }

    @Override
    public boolean changePlaces(int sourcePlaceId, int destinationPlaceId) {
        return false;
    }
}
