// automatically generated by the FlatBuffers compiler, do not modify

package com.riiablo.net.packet.bnls;

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
public final class Realm extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_25_2_10(); }
  public static Realm getRootAsRealm(ByteBuffer _bb) { return getRootAsRealm(_bb, new Realm()); }
  public static Realm getRootAsRealm(ByteBuffer _bb, Realm obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Realm __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String desc() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer descAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer descInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }

  public static int createRealm(FlatBufferBuilder builder,
      int nameOffset,
      int descOffset) {
    builder.startTable(2);
    Realm.addDesc(builder, descOffset);
    Realm.addName(builder, nameOffset);
    return Realm.endRealm(builder);
  }

  public static void startRealm(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addDesc(FlatBufferBuilder builder, int descOffset) { builder.addOffset(1, descOffset, 0); }
  public static int endRealm(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Realm get(int j) { return get(new Realm(), j); }
    public Realm get(Realm obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

