package xyz.sidetrip.banutil.commands.moderation;

import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IUser;
import xyz.sidetrip.banutil.UtilDue;

public class Unban extends Ban {

	public Unban() {
		super("unban");
	}

	@Override
	protected String getAction() {
		return ":unicorn: | Unbanned User";
	}

	@Override
	protected boolean performAction(IGuild server, IUser user, String reason) {
		if (UtilDue.userBannedOnServer(server, user)) {
			server.pardonUser(user.getLongID());
			return true;
		}
		return false;
	}
}
