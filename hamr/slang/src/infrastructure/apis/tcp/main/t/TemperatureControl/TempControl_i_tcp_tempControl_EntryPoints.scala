// #Sireum

package t.TemperatureControl

import org.sireum._
import t._

// This file was auto-generated.  Do not edit

object TempControl_i_tcp_tempControl_EntryPoints {
  var impl: TempControl_i_tcp_tempControl_EntryPointsSig = TempControl_i_tcp_tempControl_EntryPointsStub()

  def handle_fanAck(api: t.TemperatureControl.TempControl_i_Operational_Api, value : TemperatureControl.FanAck.Type): Unit = {
    impl.handle_fanAck(api, value)
  }

  def handle_setPoint(api: t.TemperatureControl.TempControl_i_Operational_Api, value : TemperatureControl.SetPoint_i): Unit = {
    impl.handle_setPoint(api, value)
  }

  def handle_tempChanged(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
    impl.handle_tempChanged(api)
  }

  def activate(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
    impl.activate(api)
  }

  def deactivate(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
    impl.deactivate(api)
  }

  def finalise(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
    impl.finalise(api)
  }

  def initialise(api: t.TemperatureControl.TempControl_i_Initialization_Api): Unit = {
    impl.initialise(api)
  }

  def recover(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
    impl.recover(api)
  }
}

@msig trait TempControl_i_tcp_tempControl_EntryPointsSig {
  def handle_fanAck(api: t.TemperatureControl.TempControl_i_Operational_Api, value : TemperatureControl.FanAck.Type): Unit

  def handle_setPoint(api: t.TemperatureControl.TempControl_i_Operational_Api, value : TemperatureControl.SetPoint_i): Unit

  def handle_tempChanged(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit

  def activate(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit

  def deactivate(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit

  def finalise(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit

  def initialise(api: t.TemperatureControl.TempControl_i_Initialization_Api): Unit

  def recover(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit
}

@record class TempControl_i_tcp_tempControl_EntryPointsStub extends TempControl_i_tcp_tempControl_EntryPointsSig {
  def stubHalt(): Unit = { halt("Stub implementation of TempControl_i_tcp_tempControl_EntryPointsSig") }

  def handle_fanAck(api: t.TemperatureControl.TempControl_i_Operational_Api, value : TemperatureControl.FanAck.Type): Unit = {
    stubHalt()
  }

  def handle_setPoint(api: t.TemperatureControl.TempControl_i_Operational_Api, value : TemperatureControl.SetPoint_i): Unit = {
    stubHalt()
  }

  def handle_tempChanged(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
    stubHalt()
  }

  def activate(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
    stubHalt()
  }

  def deactivate(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
    stubHalt()
  }

  def finalise(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
    stubHalt()
  }

  def initialise(api: t.TemperatureControl.TempControl_i_Initialization_Api): Unit = {
    stubHalt()
  }

  def recover(api: t.TemperatureControl.TempControl_i_Operational_Api): Unit = {
    stubHalt()
  }
}
