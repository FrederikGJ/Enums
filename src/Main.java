public class Main
{
        public static void main(String[] args)
        {
               //instantiating an enum (Planet)

                var planet1 = Planet.JORDEN;
                var planet2 = Planet.PLUTO;
                var planet3 = Planet.NEPTUN;

               canILiveHere(planet1);
               canILiveHere(planet2);
               canILiveHere(planet3);
        }

        public static void canILiveHere(Planet myPlanet)
        {
                switch (myPlanet)
                {
                        case JORDEN -> System.out.println(myPlanet.toString() + " her kan du godt overleve. Det er planet nr: " + myPlanet.numberInSolarSystem +" i solsystemet.");
                        default -> System.out.println(myPlanet.toString() +" her kan du ikke overleve uden en rumstation. Det er planet nr: " + myPlanet.numberInSolarSystem +" i solsystemet.");
                }
        }
}