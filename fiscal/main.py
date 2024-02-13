import PyPDF2


def main():
    # creating a pdf file object
    pdfFileObj = open('assets/FISCAL-TAX-INVOICE-invoice-262755.pdf', 'rb')

    # creating a pdf reader object
    pdfReader = PyPDF2.PdfReader(pdfFileObj)

    # printing number of pages in pdf file
    print(len(pdfReader.pages))

    # creating a page object
    pageObj = pdfReader.pages[0]

    # extracting text from page
    print(dir(pageObj))
    print(pageObj.extract_text())


if __name__ == "__main__":
    main()
