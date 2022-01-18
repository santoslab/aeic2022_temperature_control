// #Sireum

package t.TemperatureControl

import org.sireum._
import t._

// This file was auto-generated.  Do not edit

object TempSensor_i_tsp_tempSensor_EntryPoints {
  var impl: TempSensor_i_tsp_tempSensor_EntryPointsSig = TempSensor_i_tsp_tempSensor_EntryPointsStub()

  def timeTriggered(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
    impl.timeTriggered(api)
  }

  def activate(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
    impl.activate(api)
  }

  def deactivate(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
    impl.deactivate(api)
  }

  def finalise(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
    impl.finalise(api)
  }

  def initialise(api: t.TemperatureControl.TempSensor_i_Initialization_Api): Unit = {
    impl.initialise(api)
  }

  def recover(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
    impl.recover(api)
  }
}

@msig trait TempSensor_i_tsp_tempSensor_EntryPointsSig {
  def timeTriggered(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit

  def activate(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit

  def deactivate(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit

  def finalise(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit

  def initialise(api: t.TemperatureControl.TempSensor_i_Initialization_Api): Unit

  def recover(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit
}

@record class TempSensor_i_tsp_tempSensor_EntryPointsStub extends TempSensor_i_tsp_tempSensor_EntryPointsSig {
  def stubHalt(): Unit = { halt("Stub implementation of TempSensor_i_tsp_tempSensor_EntryPointsSig") }

  def timeTriggered(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
    stubHalt()
  }

  def activate(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
    stubHalt()
  }

  def deactivate(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
    stubHalt()
  }

  def finalise(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
    stubHalt()
  }

  def initialise(api: t.TemperatureControl.TempSensor_i_Initialization_Api): Unit = {
    stubHalt()
  }

  def recover(api: t.TemperatureControl.TempSensor_i_Operational_Api): Unit = {
    stubHalt()
  }
}
