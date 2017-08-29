package patterns.command.remote_undo;


public class RemoteLoader {
    public static void main(String[] args) {

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Главная комната");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonEasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonEasPushed();
        System.out.println("----------MACRO COMMANDS---------");

        // создание объектов устройств
        Light light = new Light("Спальня");
        TV tv = new TV("Спальня");
        Stereo stereo = new Stereo("Спальня");
        Hottub hottub = new Hottub("");

        // создание команд для управления устройствами
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        // массив комманд для включения
        Command[] partyOn = {lightOn, tvOn, stereoOn, hottubOn};
        // массив команд для выключения
        Command[] partyOff = {lightOff, tvOff, stereoOff, hottubOff};

        // два объекта макрокоманд, в которых хранятся массивы команд
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // связываем макрокоманду с кнопкой как и любую другую команду
        remoteControl.setCommand(6, partyOnMacro, partyOffMacro);

        remoteControl.onButtonWasPushed(6);
        System.out.println("ВЕЕЧЕРИНКА");
        remoteControl.offButtonWasPushed(6);

    }
}
