package configurations

object Instance {

  val APP_URL: String? = System.getenv("APP_URL")

  fun getMainAppUrl(): String {
    return APP_URL ?: "https://jsonplaceholder.typicode.com"
  }

  val main_app_url = getMainAppUrl()

}