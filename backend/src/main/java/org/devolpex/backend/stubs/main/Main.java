// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main.proto

package org.devolpex.backend.stubs.main;

public final class Main {
  private Main() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nmain.proto\022\037org.devolpex.backend.stubs" +
      ".main\032\014client.proto\032\rchambre.proto\032\021rese" +
      "rvation.proto\032\033google/protobuf/empty.pro" +
      "to2\246\003\n\022ReservationService\022H\n\024FetchReserv" +
      "ationList\022\027.GetReservationsListREQ\032\027.Get" +
      "ReservationsListRES\022F\n\024FetchReservationP" +
      "age\022\026.GetReservationPageREQ\032\026.GetReserva" +
      "tionPageRES\022F\n\024FetchReservationById\022\026.Ge" +
      "tReservationByIdREQ\032\026.GetReservationById" +
      "RES\0225\n\021CreateReservation\022\017.ReservationRE" +
      "Q\032\017.ReservationRES\022;\n\021UpdateReservation\022" +
      "\025.UpdateReservationREQ\032\017.ReservationRES\022" +
      "B\n\021DeleteReservation\022\025.DeleteReservation" +
      "REQ\032\026.google.protobuf.EmptyB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.devolpex.backend.stubs.client.ClientOuterClass.getDescriptor(),
          org.devolpex.backend.stubs.chambre.ChambreOuterClass.getDescriptor(),
          org.devolpex.backend.stubs.reservation.ReservationOuterClass.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    org.devolpex.backend.stubs.client.ClientOuterClass.getDescriptor();
    org.devolpex.backend.stubs.chambre.ChambreOuterClass.getDescriptor();
    org.devolpex.backend.stubs.reservation.ReservationOuterClass.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
