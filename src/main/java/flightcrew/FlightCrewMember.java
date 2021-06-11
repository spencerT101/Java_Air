package flightcrew;

public abstract class FlightCrewMember {
    private String name;
    private Rank rank;



    public FlightCrewMember(String name, Rank rank){
         this.name = name;
         this.rank = rank;

    }

    public String getName() {
        return this.name;
    }

    public Rank getRank(){
        return this.rank;
    }
}
