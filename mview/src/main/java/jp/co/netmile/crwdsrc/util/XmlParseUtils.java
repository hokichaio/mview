package jp.co.netmile.crwdsrc.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ファンくる xml パース用ユーティリティ
 *
 * @author Kenkichi Mahara
 *
 */
public final class XmlParseUtils {
	private static final SimpleDateFormat SDF_YMD = new SimpleDateFormat("yyyy-MM-dd");
	private static final SimpleDateFormat SDF_YMDHMS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	private XmlParseUtils() {
	}


	public static Date parseDate(String source) throws ParseException {
		synchronized (SDF_YMD) {
			return SDF_YMD.parse(source);
		}
	}

	public static Date parseDateTime(String source) throws ParseException {
		synchronized (SDF_YMDHMS) {
			return SDF_YMDHMS.parse(source);
		}
	}

}
