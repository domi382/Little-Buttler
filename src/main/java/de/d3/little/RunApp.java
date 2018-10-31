package de.d3.little;

import java.io.IOException;

import org.omg.CORBA.ExceptionList;

public class RunApp {
	public void run(String app) throws IOException {
		ProcessBuilder p;
		Exec exec = new Exec();
		if (app != null) {
			System.out.println("Opening %s".format(app));
			switch(app) {
				case "Minecraft":
					System.out.println(exec.exec("C:\\Program Files (x86)\\Minecraft\\MinecraftLauncher.exe"));
					return;
				case "osu!":
					System.out.println(exec.exec("C:\\Users\\LuTheLatsch\\AppData\\Local\\osu!\\osu!.exe"));
					return;
				case "FS2004":
					System.out.println(exec.exec("C:\\Program Files (x86)\\Microsoft Games\\Flight Simulator 9\\fs9.exe"));
					return;
				case "Euro Truck Simulator 2":
					System.out.println(exec.exec("C:\\Program Files (x86)\\Steam\\steamapps\\common\\Euro Truck Simulator 2\\bin\\win_x64\\eurotrucks2.exe"));
					return;
				case "Half-Life":
					System.out.println(exec.exec("C:\\Program Files (x86)\\Steam\\steamapps\\common\\Half-Life\\hl.exe"));
					return;
				case "Half-Life 2":
					System.out.println(exec.exec("C:\\Program Files (x86)\\Steam\\steamapps\\common\\Half-Life 2\\hl2.exe"));
					return;
				case "Discord":
					System.out.println(exec.exec("C:\\Users\\LuTheLatsch\\AppData\\Local\\Discord\\Update.exe --processStart Discord.exe"));
					return;
				case "Skype":
					System.out.println(exec.exec("C:\\Program Files (x86)\\Microsoft\\Skype for Desktop\\Skype.exe"));
					return;
				case "TeamSpeak 3":
					System.out.println(exec.exec("C:\\Program Files\\TeamSpeak 3 Client\\ts3client_win64.exe"));
					return;
				case "PuTTY":
					System.out.println(exec.exec("C:\\Program Files\\PuTTY\\putty.exe"));
					return;
				case "Eclipse":
					System.out.println(exec.exec("C:\\Users\\LuTheLatsch\\eclipse\\java-photon\\eclipse\\eclipse.exe"));
					return;
				case "PyCharm":
					System.out.println(exec.exec("C:\\Program Files\\JetBrains\\PyCharm Community Edition 2018.2.3\\bin\\pycharm64.exe"));
					return;
				case "Notepad++":
					System.out.println(exec.exec("C:\\Program Files (x86)\\Notepad++\\notepad++.exe"));
					return;
				case "Dolphin":
					System.out.println(exec.exec("C:\\Users\\LuTheLatsch\\Desktop\\Dolphin-x64\\Dolphin.exe"));
					return;
				case "Project 64":
					System.out.println(exec.exec("C:\\Users\\LuTheLatsch\\Desktop\\Net64plus\\emulator\\Project64.exe"));
					return;
				case "Chrome":
					System.out.println(exec.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"));
					return;
			}
		}
	}
}
