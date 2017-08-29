package patterns.command.remote_undo;


public class Stereo {

    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " наваливаем музычку");
    }

    public void off() {
        System.out.println(location + " выключаем музычку");
    }

    public void setCd() {
        System.out.println(location + " выбираем проигрывание с CD");
    }

    public void setDvd() {
        System.out.println(location + " выбираем проигрывание с DVD");
    }

    public void setRadio() {
        System.out.println(location + " устанавливаем проигрывание Радио");
    }

    public void setVolume(int volume) {
        System.out.println(location + " Громкость стерео установлена на " + volume);
    }
}
