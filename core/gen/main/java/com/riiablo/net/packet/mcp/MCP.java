// automatically generated by the FlatBuffers compiler, do not modify

package com.riiablo.net.packet.mcp;

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
public final class MCP extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_25_2_10(); }
  public static MCP getRootAsMCP(ByteBuffer _bb) { return getRootAsMCP(_bb, new MCP()); }
  public static MCP getRootAsMCP(ByteBuffer _bb, MCP obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MCP __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte dataType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table data(Table obj) { int o = __offset(6); return o != 0 ? __union(obj, o + bb_pos) : null; }

  public static int createMCP(FlatBufferBuilder builder,
      byte dataType,
      int dataOffset) {
    builder.startTable(2);
    MCP.addData(builder, dataOffset);
    MCP.addDataType(builder, dataType);
    return MCP.endMCP(builder);
  }

  public static void startMCP(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addDataType(FlatBufferBuilder builder, byte dataType) { builder.addByte(0, dataType, 0); }
  public static void addData(FlatBufferBuilder builder, int dataOffset) { builder.addOffset(1, dataOffset, 0); }
  public static int endMCP(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishMCPBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedMCPBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public MCP get(int j) { return get(new MCP(), j); }
    public MCP get(MCP obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

