// automatically generated by the FlatBuffers compiler, do not modify

package com.riiablo.net.packet.d2gs;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class SwapBodyItem extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_25_2_10(); }
  public static SwapBodyItem getRootAsSwapBodyItem(ByteBuffer _bb) { return getRootAsSwapBodyItem(_bb, new SwapBodyItem()); }
  public static SwapBodyItem getRootAsSwapBodyItem(ByteBuffer _bb, SwapBodyItem obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SwapBodyItem __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int bodyLoc() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean merc() { int o = __offset(6); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createSwapBodyItem(FlatBufferBuilder builder,
      int bodyLoc,
      boolean merc) {
    builder.startTable(2);
    SwapBodyItem.addBodyLoc(builder, bodyLoc);
    SwapBodyItem.addMerc(builder, merc);
    return SwapBodyItem.endSwapBodyItem(builder);
  }

  public static void startSwapBodyItem(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addBodyLoc(FlatBufferBuilder builder, int bodyLoc) { builder.addInt(0, bodyLoc, 0); }
  public static void addMerc(FlatBufferBuilder builder, boolean merc) { builder.addBoolean(1, merc, false); }
  public static int endSwapBodyItem(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SwapBodyItem get(int j) { return get(new SwapBodyItem(), j); }
    public SwapBodyItem get(SwapBodyItem obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

