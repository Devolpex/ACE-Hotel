// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package org.devolpex.backend.stubs.client;

public interface ChambrePRTOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ChambrePRT)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string type = 2;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>float prix = 3;</code>
   * @return The prix.
   */
  float getPrix();

  /**
   * <code>bool disponible = 4;</code>
   * @return The disponible.
   */
  boolean getDisponible();
}
