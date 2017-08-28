package com.conquestiamc.commands;

public class BaseCommand extends CqBaseCommand {

    public BaseCommand(String name) {
        super(name);
    }

    public String getCommandLabel() {
        return "jukebox";
    }

    public String[] getAliases() {
        String[] aliases = new String[]{"cqj", "cqjukebox", "jb", "cqjb"};
        return aliases;
    }

    public String[] getPermissions() {
        String[] perms = new String[]{"cq.jukebox"};
        return perms;
    }

    public String getDescription() {
        return "Show all Jukebox commands";
    }

    public String getFormattedCommand() {
        return "/cqjukebox";
    }

    public String getUsage() {
        return "Usage: /cqjukebox";
    }
}
