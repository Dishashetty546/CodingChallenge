def chatbot():
    print("Hi im chatbot! how can I help you!")
    print("you can ask me ques on weather, food, help, bye if you want to exit")

    while True:
        user_input= input("You: ")
        if user_input=="bye":
            print("Thank you for spending your valuable time with me, have a great day, Bye!")
            break

        elif 'name' in user_input:
            print("Hello Im a chatbot, I can help you in any way")
        elif 'weather' in user_input:
            print("weather is chill here, slighly rainy")
        elif 'help' in user_input:
            print("Im a virtual chat assistent I can assist you virtually")
        elif 'how are you' in user_input:
            print("Im doing all great, how can i help you")
        else:
            print("Soory I didnt not get you point, could you please repeat the ques again")
if __name__=="__main__":
    chatbot()