// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package org.devolpex.backend.stubs.reservation;

public interface UpdateReservationREQOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UpdateReservationREQ)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.ReservationREQ reservation = 2;</code>
   * @return Whether the reservation field is set.
   */
  boolean hasReservation();
  /**
   * <code>.ReservationREQ reservation = 2;</code>
   * @return The reservation.
   */
  org.devolpex.backend.stubs.reservation.ReservationREQ getReservation();
  /**
   * <code>.ReservationREQ reservation = 2;</code>
   */
  org.devolpex.backend.stubs.reservation.ReservationREQOrBuilder getReservationOrBuilder();
}