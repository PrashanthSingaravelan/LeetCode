from flask import Flask, render_template

app = Flask(__name__)
 
@app.route("/")
def index():
    return render_template('index.html')

@app.route("/prashanth/<name>")
def prashanth_name(name):
    return render_template('page_1.html', name=name)

if __name__ == '__main__':
	app.run(debug=True)
