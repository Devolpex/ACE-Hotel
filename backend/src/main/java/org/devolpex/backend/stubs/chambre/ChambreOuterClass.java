// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chambre.proto

package org.devolpex.backend.stubs.chambre;

public final class ChambreOuterClass {
  private ChambreOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Chambre_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Chambre_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rchambre.proto\"E\n\007Chambre\022\n\n\002id\030\001 \001(\003\022\014" +
      "\n\004type\030\002 \001(\t\022\014\n\004prix\030\003 \001(\002\022\022\n\ndisponible" +
      "\030\004 \001(\010B&\n\"org.devolpex.backend.stubs.cha" +
      "mbreP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Chambre_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Chambre_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Chambre_descriptor,
        new java.lang.String[] { "Id", "Type", "Prix", "Disponible", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
