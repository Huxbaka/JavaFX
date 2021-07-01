import requests
from bs4 import BeautifulSoup
url = f"https://howdyho.net/page/1" # могу сделать чтобы парсило все страницы есло что
HEADERS = {
    'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.106 Safari/537.36'
}
responce = requests.get(url, headers = HEADERS)
soup = BeautifulSoup(responce.content, 'html.parser')
zagol = soup.findAll('div', class_="details")
comps = []
for i in zagol:
    comps.append({
        'title': i.find('a', class_="").get_text(strip=True),
        'zagolovok': i.find('p', class_="").text,
        'silka': i.find('a', class_="").get("href")
    })
for comp in comps:
    print(f"Названия: {comp['title']} -> Описания: {comp['zagolovok']} ->Сылка: https://howdyho.net/{comp['silka']}")
