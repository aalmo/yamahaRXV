# Yamaha Network Receiver - JAVA API

#About

This is a java plugin implementation, which allows you to control Yamaha AV Receivers over IP. 

#Tested Models
RX-V473 [working]

#Supported Models 

normally, any Yamaha RX-Vxxx models are supported.

#Installation
In the target folder, you have two jars:
* The yamaha.rxv-V1.0-SNAPSHOT-jar-with-dependencies.jar: This includes all the dependencies you need to get started
* The yamaha.rxv-V1.0-SNAPSHOT.jar: This one does not include all the depedencies. You have to add them yourself using the following maven dependencies
```
<dependencies>
		<dependency>
			<groupId>org.jvnet.jaxb2_commons</groupId>
			<artifactId>jaxb2-basics-runtime</artifactId>
			<version>0.6.4</version>
		</dependency>
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.17</version>
		</dependency>
		<dependency>
			<groupId>commons-httpclient</groupId>
			<artifactId>commons-httpclient</artifactId>
			<version>3.1</version>
		</dependency>
</dependencies>
```

in the ressources folder, please add the following property fieles
* yamaha.properties
* log4j.properties

You will finde an example of these properties in the ressources folder. Now add one of these jars to your project lib and start working :)

#Supported Functionality
* Volume Control
* Power Control
* Input Control
* Surround Control
* Sound Video Control
* View Reciever Status

#Planned Functionality
* Tuner Control
* System Setting View
* Partly System Setting Control

#How to use the API
In order to get the Reciever Status
```
ObjectFactory factory = new ObjectFactory();
YAMAHAAV yamahaav = factory.getRecieverStatus();
```

To make mutltiple changes and submit them at once 
```
yamahaav.getMainZone().getPowerControl().setPower(YAMAHACMD.POWER.ON);
yamahaav.getMainZone().getSurround().set3DCinemaDSP(YAMAHACMD.SOUNDPROGRAM.CINEMADSP_AUTO);
yamahaav.getMainZone().getVolume().setMute(YAMAHACMD.VOLUME.MUTE_OFF);
factory.updateReciever(yamahaav);
```

To create new objects and make changes to certain elements 
```
ObjectFactory factory = new ObjectFactory();
YAMAHAAV yamahaav = factory.createRoot();
PowerControl control = factory.createYAMAHAAVMainZonePowerControl();
control.setPower(YAMAHACMD.POWER.ON);
yamahaav.getMainZone().setPowerControl(control);
factory.updateRecieverProperty(yamahaav);
```
When creating a new yamaha structure, put in mind, that you have to maintain the following XML structure. The same applies to every main block.
```
<YAMAHA_AV rsp="GET" RC="0" cmd="PUT">
    <Main_Zone>
    	<Basic_Status>GetParam</Basic_Status>
        <Power_Control>
            <Power>Standby</Power>
            <Sleep>Off</Sleep>
        </Power_Control>
    </Main_Zone>
</YAMAHA_AV>
```

