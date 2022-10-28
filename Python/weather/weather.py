# python script to find the weather conditions
import requests
from pprint import pprint
# Find your API key from openweather.org and replace it with your API key
API_Key = "Your API key"
# Enter your desired  location to find weather conditions
location = input("Enter Your Desired Location: ")
weather_url = f"http://api.openweathermap.org/data/2.5/weather?q={location}&appid="
final_url = weather_url + API_Key
weather_data = requests.get(final_url).json()
pprint(weather_data)