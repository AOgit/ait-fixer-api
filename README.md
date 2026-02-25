# 💱 Currency Converter — Fixer API

A **Java console application** for currency conversion using the [Fixer API](https://apilayer.com/marketplace/fixer-api).

Homework project for the **REST Client / External API** lesson at **AIT TR GmbH** (cohort 60).

---

## 📋 Task

Using the **Fixer API**, build a currency converter application where the user enters from the console:
- The currency to convert **from**
- The currency to convert **to**
- The **amount** to convert

The application prints the converted result.

---

## 🛠 Tech Stack

- Java 23
- Spring Web (`RestTemplate`, `UriComponentsBuilder`) — no Spring Boot
- Jackson Databind (JSON deserialization)
- Lombok
- Maven

---

## 🚀 How It Works

1. The app prompts the user to enter input via the console
2. Builds a request to `https://api.apilayer.com/fixer/convert` with query params `from`, `to`, `amount`
3. Sends an HTTP GET request with the API key in the `apikey` header using `RestTemplate`
4. Deserializes the JSON response into `FixerResult`
5. Prints the converted amount and target currency

---

## 🖥 Console Example

```
Enter currency (from): USD
Enter currency (to): EUR
Enter amount: 100
Result: 91.25 EUR
```

---

## 📁 Project Structure

```
src/main/java/ait/fixer/
├── FixerAppl.java          # Main class — reads console input, calls API, prints result
├── dto/
│   └── FixerResult.java    # Maps JSON response (success, date, result, query)
└── utils/
    └── DataFromConsole.java # Reads from, to, amount from Scanner
```

---

## ⚙️ Getting Started

```bash
git clone https://github.com/AOgit/ait-fixer-api.git
cd ait-fixer-api
```

Run via IntelliJ IDEA or:

```bash
mvn compile exec:java -Dexec.mainClass="ait.fixer.FixerAppl"
```

> **Note:** The API key is hardcoded in `FixerAppl.java`. To use your own key, register at [apilayer.com](https://apilayer.com/marketplace/fixer-api) and replace the value of `apiKey`.
