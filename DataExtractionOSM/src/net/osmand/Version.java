package net.osmand;

import java.net.URLEncoder;

public class Version {
	
	public static final String APP_NAME = "OsmAnd"; //$NON-NLS-1$
	public static final String APP_MAP_CREATOR_NAME = "OsmAndMapCreator"; //$NON-NLS-1$
	public static final String APP_VERSION = "0.5.3"; //$NON-NLS-1$
	public static final String APP_DESCRIPTION = "beta (b1)"; //$NON-NLS-1$
	public static final boolean VELCOM_EDITION = false;
	
	public static final String APP_NAME_VERSION = APP_NAME + " " + APP_VERSION; //$NON-NLS-1$
	public static final String APP_FULL_NAME = APP_NAME + " " + APP_VERSION + " " +APP_DESCRIPTION; //$NON-NLS-1$ //$NON-NLS-2$
	public static final String APP_MAP_CREATOR_FULL_NAME = APP_MAP_CREATOR_NAME + " " + APP_VERSION + " " +APP_DESCRIPTION; //$NON-NLS-1$ //$NON-NLS-2$
	
	public static String getVersionAsURLParam() {
		return "osmandver=" + URLEncoder.encode(APP_VERSION + " " + APP_DESCRIPTION);
	}

}
