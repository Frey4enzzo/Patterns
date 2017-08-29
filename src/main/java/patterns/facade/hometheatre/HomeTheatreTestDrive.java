package patterns.facade.hometheatre;


public class HomeTheatreTestDrive {

    public static void main(String[] args) {


        Amplifier amp = new Amplifier("Top-O-Line Усилитель");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Тюнер", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Проектор", dvd);
        TheaterLights lights = new TheaterLights("Подсветка");
        Screen screen = new Screen("Экран домашнего кинотеатра");
        PopcornPopper popper = new PopcornPopper("Попкорн");


        HomeTheatreFacade homeTheatre =
                new HomeTheatreFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);

        homeTheatre.watchMovie("Карты, деньги, 2 ствола");
        homeTheatre.endMovie();

    }
}
