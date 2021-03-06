// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief A BufferBuilder for building a buffer containing a bitmap */
@Name("arrow::TypedBufferBuilder<bool>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class TypedBufferBuilder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypedBufferBuilder(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TypedBufferBuilder(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TypedBufferBuilder position(long position) {
        return (TypedBufferBuilder)super.position(position);
    }
    @Override public TypedBufferBuilder getPointer(long i) {
        return new TypedBufferBuilder(this).position(position + i);
    }

  public TypedBufferBuilder(MemoryPool pool/*=default_memory_pool()*/) { super((Pointer)null); allocate(pool); }
  private native void allocate(MemoryPool pool/*=default_memory_pool()*/);
  public TypedBufferBuilder() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @ByVal Status Append(@Cast("bool") boolean value);

  public native @ByVal Status Append(@Cast("const uint8_t*") BytePointer valid_bytes, @Cast("int64_t") long num_elements);
  public native @ByVal Status Append(@Cast("const uint8_t*") ByteBuffer valid_bytes, @Cast("int64_t") long num_elements);
  public native @ByVal Status Append(@Cast("const uint8_t*") byte[] valid_bytes, @Cast("int64_t") long num_elements);

  public native @ByVal Status Append(@Cast("const int64_t") long num_copies, @Cast("bool") boolean value);

  public native void UnsafeAppend(@Cast("bool") boolean value);

  public native void UnsafeAppend(@Cast("const uint8_t*") BytePointer bytes, @Cast("int64_t") long num_elements);
  public native void UnsafeAppend(@Cast("const uint8_t*") ByteBuffer bytes, @Cast("int64_t") long num_elements);
  public native void UnsafeAppend(@Cast("const uint8_t*") byte[] bytes, @Cast("int64_t") long num_elements);

  public native void UnsafeAppend(@Cast("const int64_t") long num_copies, @Cast("bool") boolean value);

  public native @ByVal Status Resize(@Cast("const int64_t") long new_capacity, @Cast("bool") boolean shrink_to_fit/*=true*/);
  public native @ByVal Status Resize(@Cast("const int64_t") long new_capacity);

  public native @ByVal Status Reserve(@Cast("const int64_t") long additional_elements);

  public native @ByVal Status Advance(@Cast("const int64_t") long length);

  public native @ByVal Status Finish(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer out, @Cast("bool") boolean shrink_to_fit/*=true*/);
  public native @ByVal Status Finish(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer out);

  public native void Reset();

  public native @Cast("int64_t") long length();
  public native @Cast("int64_t") @Name("capacity") long _capacity();
  public native @Cast("const uint8_t*") BytePointer data();
  public native @Cast("uint8_t*") BytePointer mutable_data();
  public native @Cast("int64_t") long false_count();
}
