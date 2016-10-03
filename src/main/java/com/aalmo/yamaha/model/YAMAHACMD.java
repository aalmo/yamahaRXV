package com.aalmo.yamaha.model;

public class YAMAHACMD {
	public class VOLUME {
		public static final String MUTE_ON	= "On";
		public static final String MUTE_OFF	= "Off";
	}
	public class SOUNDVIDEO{
		public static final String DIRECTMODE_ON	= "On";
		public static final String DIRECTMODE_OFF	= "Off";
		public static final String ADAPTIVE_DRC_ON 	= "On";
		public static final String ADAPTIVE_DRC_OFF = "Off";
		public class HDMI{
			public static final String STANDBY_ON	= "On";
			public static final String STANDBY_OFF	= "Off";
			public static final String OUTPUT_ON	= "On";
			public static final String OUTPUT_OFF	= "Off";
		}
	}
	public class SOUNDPROGRAM {
		public static final String ON 				= "On";
		public static final String OFF 				= "Off";
		public static final String SURROUNDDEC 		= "Surround Decoder";
		public static final String STRAIGHT_ON		= "On";
		public static final String STRAIGHT_OFF		= "Off";
		public static final String ENHANCER_ON		= "On";
		public static final String ENHANCER_OFF		= "Off";
		public static final String CINEMADSP_AUTO 	= "Auto";
		public static final String SOUNDPROGRAM_CH5 = "5ch Stereo";
		
		public class MOVIE {
			public static final String SCIFI 		= "Sci-Fi";
			public static final String MONOMOVIE 	= "Mono Movie";
			public static final String SPORTS 		= "Sports";
			public static final String ACTIONGAME 	= "Action Game";
			public static final String RPLAYGAME	= "Roleplaying Game";
			public static final String STANDARD 	= "Standard";
			public static final String SPECTACLE 	= "Spectacle";
		}
		
		public class MUSIC {
			public static final String CH5 			= "5ch Stereo";
			public static final String CH2 			= "2ch Stereo";
			public static final String HALLINMUNIC	= "Hall in Munich";
			public static final String HALLINVIENAA	= "Hall in Vienna";
			public static final String CHAMBER 		= "Chamber";
			public static final String CELLARCLUB 	= "Cellar Club";
			public static final String ROXYTHEATRE	= "The Roxy Theatre";
			public static final String BOTTOMLINE 	= "The Bottom Line";
			public static final String MUSICVIDEO 	= "Music Video";
		}
	}
	public class POWER {
		public static final String ON 			= "On";
		public static final String OFF 			= "Off";
		public static final String STADBY 		= "Standby";
		public static final String SLEEP_120MIN = "120 min";
		public static final String SLEEP_90MIN 	= "90 min";
		public static final String SLEEP_60MIN 	= "60 min";
		public static final String SLEEP_30MIN 	= "30 min";
	}
	
    public class INPUT {
    	public static final String NET_RADIO 	= "NET Radio";
    	public static final String AIRPLAY 		= "AirPlay";
    	public static final String HDMI1 		= "HDMI1";
    	public static final String HDMI2		= "HDMI2"; 
    	public static final String HDMI3 		= "HDMI3";
    	public static final String HDMI4 		= "HDMI4";
    	public static final String HDMI5 		= "HDMI5";
    	public static final String AUDIO 		= "AUDIO";
    	public static final String VAUX  		= "V-AUX";	
    	public static final String TUNER 		= "TUNER";
    	public static final String AV1 			= "AV1";
    	public static final String AV2 			= "AV1";
    	public static final String AV3 			= "AV1";
    	public static final String AV4 			= "AV1";
    	public static final String AV5 			= "AV1";
    	public static final String AV6 			= "AV1";
    	public static final String USB 			= "USB";   
    }
    public class XMLMeta{
    	public static final String GETPARAM 	= "GetParam";
    	public static final String PUT 			= "PUT";
    	public static final String GET 			= "GET";
    	public static final String GETXML		= "<?xml version=\"1.0\" encoding=\"utf-8\"?><YAMAHA_AV cmd=\"GET\"><Main_Zone><Basic_Status>GetParam</Basic_Status></Main_Zone></YAMAHA_AV>";
    	
    }
}
