/*
 * MIT License
 *
 * Copyright (c) 2018 Glare
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.glaremasters.guilds.commands.gui;

import ch.jalu.configme.SettingsManager;
import co.aikar.commands.ACFUtil;
import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import lombok.AllArgsConstructor;
import me.glaremasters.guilds.exceptions.ExpectationNotMet;
import me.glaremasters.guilds.exceptions.InvalidPermissionException;
import me.glaremasters.guilds.guild.Guild;
import me.glaremasters.guilds.guild.GuildHandler;
import me.glaremasters.guilds.guild.GuildRole;
import me.glaremasters.guilds.guild.GuildTier;
import me.glaremasters.guilds.messages.Messages;
import me.glaremasters.guilds.utils.Constants;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Created by Glare
 * Date: 4/8/2019
 * Time: 9:09 AM
 */
@AllArgsConstructor @CommandAlias(Constants.ROOT_ALIAS)
public class CommandVault extends BaseCommand {

    private GuildHandler guildHandler;
    private SettingsManager settingsManager;

    /**
     * Opens the guild vault
     * @param player the player opening the vault
     * @param guild the guild's vault which's being opened
     * @param role the role of the player
     */
    @Subcommand("vault")
    @Description("{@@descriptions.vault}")
    @CommandPermission(Constants.BASE_PERM + "vault")
    public void execute(Player player, Guild guild, GuildRole role, @Default("1") Integer vault) {
        if (!role.isOpenVault())
            ACFUtil.sneaky(new InvalidPermissionException());

        if (vault == 0)
            vault = 1;

        if (!guildHandler.hasVaultUnlocked(vault, guild))
            ACFUtil.sneaky(new ExpectationNotMet(Messages.VAULTS__MAXED));

        try {
            guildHandler.getGuildVault(guild, vault);
        } catch (Exception ex) {
            guildHandler.getCachedVaults().get(guild).add(guildHandler.createNewVault(settingsManager));
        }

        player.openInventory(guildHandler.getGuildVault(guild, vault));
        guildHandler.getOpenedVault().add(player);
    }

}