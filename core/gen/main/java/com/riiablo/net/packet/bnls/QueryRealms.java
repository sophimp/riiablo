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
public final class QueryRealms extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_25_2_10(); }
  public static QueryRealms getRootAsQueryRealms(ByteBuffer _bb) { return getRootAsQueryRealms(_bb, new QueryRealms()); }
  public static QueryRealms getRootAsQueryRealms(ByteBuffer _bb, QueryRealms obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public QueryRealms __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public com.riiablo.net.packet.bnls.Realm realms(int j) { return realms(new com.riiablo.net.packet.bnls.Realm(), j); }
  public com.riiablo.net.packet.bnls.Realm realms(com.riiablo.net.packet.bnls.Realm obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int realmsLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public com.riiablo.net.packet.bnls.Realm.Vector realmsVector() { return realmsVector(new com.riiablo.net.packet.bnls.Realm.Vector()); }
  public com.riiablo.net.packet.bnls.Realm.Vector realmsVector(com.riiablo.net.packet.bnls.Realm.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createQueryRealms(FlatBufferBuilder builder,
      int realmsOffset) {
    builder.startTable(1);
    QueryRealms.addRealms(builder, realmsOffset);
    return QueryRealms.endQueryRealms(builder);
  }

  public static void startQueryRealms(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addRealms(FlatBufferBuilder builder, int realmsOffset) { builder.addOffset(0, realmsOffset, 0); }
  public static int createRealmsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startRealmsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endQueryRealms(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public QueryRealms get(int j) { return get(new QueryRealms(), j); }
    public QueryRealms get(QueryRealms obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

