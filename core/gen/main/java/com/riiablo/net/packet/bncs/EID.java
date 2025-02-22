// automatically generated by the FlatBuffers compiler, do not modify

package com.riiablo.net.packet.bncs;

@SuppressWarnings("unused")
public final class EID {
  private EID() { }
  public static final byte EID_SHOWUSER = 1;
  public static final byte EID_JOIN = 2;
  public static final byte EID_LEAVE = 3;
  public static final byte EID_WHISPER = 4;
  public static final byte EID_TALK = 5;
  public static final byte EID_BROADCAST = 6;
  public static final byte EID_CHANNEL = 7;
  public static final byte EID_USERFLAGS = 9;
  public static final byte EID_WHISPERSENT = 10;
  public static final byte EID_CHANNELFULL = 13;
  public static final byte EID_CHANNELDOESNOTEXIST = 14;
  public static final byte EID_CHANNELRESTRICTED = 15;
  public static final byte EID_INFO = 18;
  public static final byte EID_ERROR = 19;
  public static final byte EID_IGNORE = 21;
  public static final byte EID_ACCEPT = 22;
  public static final byte EID_EMOTE = 23;

  public static final String[] names = { "EID_SHOWUSER", "EID_JOIN", "EID_LEAVE", "EID_WHISPER", "EID_TALK", "EID_BROADCAST", "EID_CHANNEL", "", "EID_USERFLAGS", "EID_WHISPERSENT", "", "", "EID_CHANNELFULL", "EID_CHANNELDOESNOTEXIST", "EID_CHANNELRESTRICTED", "", "", "EID_INFO", "EID_ERROR", "", "EID_IGNORE", "EID_ACCEPT", "EID_EMOTE", };

  public static String name(int e) { return names[e - EID_SHOWUSER]; }
}

