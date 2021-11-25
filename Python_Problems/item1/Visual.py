import tkinter as tk
from tkinter import ttk
win = tk.Tk()
ttk.Label(win, text="A Label").grid(column=0, row=0)

win.title("Python Demo")
win.mainloop()