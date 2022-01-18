// #Sireum

package t.TemperatureControl

import org.sireum._
import t._

// This file was auto-generated.  Do not edit

object Fan_i_fp_fan_EntryPoints {
  var impl: Fan_i_fp_fan_EntryPointsSig = Fan_i_fp_fan_EntryPointsStub()

  def handle_fanCmd(api: t.TemperatureControl.Fan_i_Operational_Api, value : TemperatureControl.FanCmd.Type): Unit = {
    impl.handle_fanCmd(api, value)
  }

  def activate(api: t.TemperatureControl.Fan_i_Operational_Api): Unit = {
    impl.activate(api)
  }

  def deactivate(api: t.TemperatureControl.Fan_i_Operational_Api): Unit = {
    impl.deactivate(api)
  }

  def finalise(api: t.TemperatureControl.Fan_i_Operational_Api): Unit = {
    impl.finalise(api)
  }

  def initialise(api: t.TemperatureControl.Fan_i_Initialization_Api): Unit = {
    impl.initialise(api)
  }

  def recover(api: t.TemperatureControl.Fan_i_Operational_Api): Unit = {
    impl.recover(api)
  }
}

@msig trait Fan_i_fp_fan_EntryPointsSig {
  def handle_fanCmd(api: t.TemperatureControl.Fan_i_Operational_Api, value : TemperatureControl.FanCmd.Type): Unit

  def activate(api: t.TemperatureControl.Fan_i_Operational_Api): Unit

  def deactivate(api: t.TemperatureControl.Fan_i_Operational_Api): Unit

  def finalise(api: t.TemperatureControl.Fan_i_Operational_Api): Unit

  def initialise(api: t.TemperatureControl.Fan_i_Initialization_Api): Unit

  def recover(api: t.TemperatureControl.Fan_i_Operational_Api): Unit
}

@record class Fan_i_fp_fan_EntryPointsStub extends Fan_i_fp_fan_EntryPointsSig {
  def stubHalt(): Unit = { halt("Stub implementation of Fan_i_fp_fan_EntryPointsSig") }

  def handle_fanCmd(api: t.TemperatureControl.Fan_i_Operational_Api, value : TemperatureControl.FanCmd.Type): Unit = {
    stubHalt()
  }

  def activate(api: t.TemperatureControl.Fan_i_Operational_Api): Unit = {
    stubHalt()
  }

  def deactivate(api: t.TemperatureControl.Fan_i_Operational_Api): Unit = {
    stubHalt()
  }

  def finalise(api: t.TemperatureControl.Fan_i_Operational_Api): Unit = {
    stubHalt()
  }

  def initialise(api: t.TemperatureControl.Fan_i_Initialization_Api): Unit = {
    stubHalt()
  }

  def recover(api: t.TemperatureControl.Fan_i_Operational_Api): Unit = {
    stubHalt()
  }
}
