package jp.co.netmile.crwdsrc.dto;

import java.util.Map;

import jp.co.netmile.crwdsrc.dto.enumeration.EventMessageType;
import jp.co.netmile.crwdsrc.dto.enumeration.MailDeliverType;


/**
 * ファンくるに関し、システム間でやりとりする情報<br />
 *
 * @author Kenkichi Mahara
 *
 */

public class EventMessage implements FancrewObject {
	/** EventMessage.id */
	private long id;

	/** イベント種別 (必須) */
	private EventMessageType type;

	/** メール配送種別 */
	private MailDeliverType mailDeliverType;

	/** 応募情報 */
	private Application application;

	/** 追加情報 (オプション) */
	private Map<String, String> properties;

	/* ================================================================= */
	// Digester 用 setter

	public void setTypeById(String sId) {
		int id = Integer.parseInt(sId);

		type = EventMessageType.valueOfId(id);
	}

	/* ================================================================= */
	// getter/setter

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EventMessageType getType() {
		return type;
	}

	public void setType(EventMessageType type) {
		this.type = type;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public MailDeliverType getMailDeliverType() {
		return mailDeliverType;
	}

	public void setMailDeliverType(MailDeliverType mailDeliverType) {
		this.mailDeliverType = mailDeliverType;
	}

}
