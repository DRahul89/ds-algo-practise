package metallica.trade.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import metallica.trade.enums.Command;
import metallica.trade.enums.Status;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = TradeCommand.class)
public class TradeCommand {

	private Command commandType;

	private Status status;

	public Command getCommandType() {
		return commandType;
	}

	public void setCommandType(Command commandType) {
		this.commandType = commandType;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TradeCommand [status=" + status + "]";
	}

}
