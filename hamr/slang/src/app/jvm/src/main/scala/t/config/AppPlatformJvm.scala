// #Sireum

package t.config

import org.sireum._
import t._

@record class AppPlatformJvm extends PlatformConfig {
  def setup(): Unit = {
    ExternalConfig.setup()
    TranspilerUtil.touch()
  }
}

@ext("ExternalConfigJvm") object ExternalConfig {
  def setup(): Unit = $
}
