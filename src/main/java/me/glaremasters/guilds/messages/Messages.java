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

package me.glaremasters.guilds.messages;

import co.aikar.locales.MessageKey;
import co.aikar.locales.MessageKeyProvider;

/**
 * Created by GlareMasters
 * Date: 9/12/2018
 * Time: 5:00 PM
 */
public enum Messages implements MessageKeyProvider {

    CREATE__SUCCESSFUL, CREATE__REQUIREMENTS, CREATE__WARNING, CREATE__GUILD_NAME_TAKEN, CREATE__CANCELLED, CREATE__NAME_TOO_LONG,

    ERROR__ALREADY_IN_GUILD, ERROR__BLACKLIST, ERROR__NO_GUILD, ERROR__ROLE_NO_PERMISSION, ERROR__GUILD_NO_EXIST, ERROR__PLAYER_NOT_FOUND, ERROR__PLAYER_NOT_IN_GUILD, ERROR__NOT_OFFICER, ERROR__NOT_ENOUGH_MONEY,

    BANK__BALANCE, BANK__DEPOSIT_SUCCESS, BANK__WITHDRAWL_SUCCESS, BANK__NOT_ENOUGH_BANK, BANK__OVER_MAX,

    ADMIN__DELETE_WARNING, ADMIN__DELETE_SUCCESS, ADMIN__GUILD_VAULT_SIGN, ADMIN__PLAYER_ADDED, ADMIN__ADMIN_PLAYER_ADDED, ADMIN__ADMIN_GUILD_ADD, ADMIN__PLAYER_REMOVED, ADMIN__ADMIN_PLAYER_REMOVED,

    ADMIN__ADMIN_GUILD_REMOVE, ADMIN__ADMIN_UPGRADE, ADMIN__ADMIN_GUILD_UPGRADE, ADMIN__SPY_ON, ADMIN__SPY_OFF,

    BOOT__PLAYER_KICKED, BOOT__SUCCESSFUL, BOOT__KICKED,

    DECLINE__SUCCESS,

    DELETE__SUCCESSFUL, DELETE__CANCELLED, DELETE__WARNING,

    LEAVE__CANCELLED, LEAVE__PLAYER_LEFT, LEAVE__SUCCESSFUL, LEAVE__WARNING_GUILDMASTER, LEAVE__WARNING, LEAVE__GUILDMASTER_LEFT,

    TRANSFER__SUCCESS, TRANSFER__NEWMASTER,

    UPGRADE__TIER_MAX, UPGRADE__NOT_ENOUGH_MEMBERS, UPGRADE__NOT_ENOUGH_MONEY, UPGRADE__MONEY_WARNING, UPGRADE__SUCCESS, UPGRADE__CANCEL,

    PREFIX__SUCCESSFUL,

    STATUS__SUCCESSFUL,

    RENAME__SUCCESSFUL,

    HOME__TELEPORTED, HOME__NO_HOME_SET, HOME__COOLDOWN, HOME__WARMUP, HOME__CANCELLED,

    SETHOME__SUCCESSFUL, SETHOME__COOLDOWN,

    RELOAD__RELOADED,

    CANCEL__ERROR, CANCEL__SUCCESS,

    CONFIRM__ERROR, CONFIRM__SUCCESS,

    CHAT__ENABLED, CHAT__DISABLED,

    ALLY__NONE, ALLY__LIST, ALLY__CURRENT_DECLINED, ALLY__TARGET_DECLINED, ALLY__CURRENT_ACCEPTED, ALLY__TARGET_ACCEPTED, ALLY__INVITE_SENT, ALLY__INCOMING_INVITE, ALLY__CURRENT_REMOVE, ALLY__TARGET_REMOVE,

    ALLY__ALREADY_ALLY, ALLY__SAME_GUILD, ALLY__NOT_ALLIED, ALLY__ALREADY_REQUESTED,

    ACCEPT__GUILD_FULL, ACCEPT__NOT_INVITED, ACCEPT__PLAYER_JOINED, ACCEPT__SUCCESSFUL,

    PENDING__INVITES,

    INVITE__ALREADY_INVITED, INVITE__MESSAGE, INVITE__SUCCESSFUL,

    DEMOTE__CANT_DEMOTE, DEMOTE__DEMOTE_SUCCESSFUL, DEMOTE__YOU_WERE_DEMOTED,

    PROMOTE__CANT_PROMOTE, PROMOTE__PROMOTE_SUCCESSFUL, PROMOTE__YOU_WERE_PROMOTED,

    REQUEST__SUCCESS, REQUEST__INCOMING_REQUEST,

    CLAIM__ALREADY_EXISTS, CLAIM__OVERLAP, CLAIM__SUCCESS, CLAIM__HOOK_DISABLED,

    UNCLAIM__SUCCESS, UNCLAIM__NOT_FOUND,

    CODES__CREATED, CODES__EMPTY, CODES__LIST_HEADER, CODES__LIST_ITEM, CODES__DELETED, CODES__INVALID_CODE, CODES__JOINED, CODES__OUT, CODES__INFO, CODES__MAX, CODES__GUILD_MESSAGE,

    VAULTS__MAXED, VAULTS__BLACKLISTED,

    LANGUAGES__SET, LANGUAGES__WARNING, LANGUAGES__UPDATED, LANGUAGES__CONSOLE_ONLY,

    HELP__HEADER, HELP__DETAILED_HEADER, HELP__FORMAT, HELP__COMMAND_FORMAT, HELP__PARAMETER_FORMAT,
    HELP__PAGE_INFO, HELP__SEARCH_HEADER;

    /**
     * Message keys that grab from the config to send messages
     */
    private final MessageKey key = MessageKey.of(this.name().toLowerCase().replace("__", ".").replace("_", "-"));


    /**
     * Get the message get from the config
     * @return message key
     */
    public MessageKey getMessageKey() {
        return key;
    }
}
