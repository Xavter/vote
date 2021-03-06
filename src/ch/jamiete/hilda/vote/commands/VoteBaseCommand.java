/*******************************************************************************
 * Copyright 2017 jamietech
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ch.jamiete.hilda.vote.commands;

import java.util.Arrays;
import ch.jamiete.hilda.Hilda;
import ch.jamiete.hilda.commands.ChannelSeniorCommand;
import ch.jamiete.hilda.vote.VotePlugin;

public class VoteBaseCommand extends ChannelSeniorCommand {

    public VoteBaseCommand(final Hilda hilda, final VotePlugin plugin) {
        super(hilda);

        this.setName("vote");
        this.setAliases(Arrays.asList(new String[] { "v" }));
        this.setDescription("Vote management system.");

        this.registerSubcommand(new VoteCloseCommand(hilda, this, plugin));
        this.registerSubcommand(new VoteDeleteCommand(hilda, this, plugin));
        this.registerSubcommand(new VoteListCommand(hilda, this, plugin));
        this.registerSubcommand(new VoteOpenCommand(hilda, this, plugin));
        this.registerSubcommand(new VoteRegisterCommand(hilda, this, plugin));
        this.registerSubcommand(new VoteServerlistCommand(hilda, this, plugin));
        this.registerSubcommand(new VoteStartCommand(hilda, this, plugin));
    }

}
