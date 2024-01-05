package com.twoi.twoi_manager.commands;


import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

public class AssignTeamMember {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher){
        //Permission levels: 0 - all; 1 - moderator; 2 - game master; 3 - admin; 4 - owner;
        dispatcher.register(Commands.literal("twoiTeam").requires(cs -> cs.hasPermission(3))
                .then(Commands.literal("memberAdd").then(Commands.argument("username", StringArgumentType.string()).executes((command) -> {
            System.out.println(command.getArgument("username", String.class));
            return 0;
        }))));
    }
}
