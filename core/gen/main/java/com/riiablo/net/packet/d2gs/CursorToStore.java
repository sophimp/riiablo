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
public final class CursorToStore extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_25_2_10(); }
  public static CursorToStore getRootAsCursorToStore(ByteBuffer _bb) { return getRootAsCursorToStore(_bb, new CursorToStore()); }
  public static CursorToStore getRootAsCursorToStore(ByteBuffer _bb, CursorToStore obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public CursorToStore __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int storeLoc() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int x() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int y() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createCursorToStore(FlatBufferBuilder builder,
      int storeLoc,
      int x,
      int y) {
    builder.startTable(3);
    CursorToStore.addY(builder, y);
    CursorToStore.addX(builder, x);
    CursorToStore.addStoreLoc(builder, storeLoc);
    return CursorToStore.endCursorToStore(builder);
  }

  public static void startCursorToStore(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addStoreLoc(FlatBufferBuilder builder, int storeLoc) { builder.addInt(0, storeLoc, 0); }
  public static void addX(FlatBufferBuilder builder, int x) { builder.addInt(1, x, 0); }
  public static void addY(FlatBufferBuilder builder, int y) { builder.addInt(2, y, 0); }
  public static int endCursorToStore(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public CursorToStore get(int j) { return get(new CursorToStore(), j); }
    public CursorToStore get(CursorToStore obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

