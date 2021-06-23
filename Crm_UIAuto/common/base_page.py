

class BasePage(object):
    def __init__(self, driver):
        self.driver = driver

    def open_url(self, url):
        self.driver.get(url)

    def quit(self):
        self.driver.quit()
    #获取定位元素的方法
    def find_element(self,element_info):
        element_name = element_info['element_name']
        locator_type = element_info['locator_type']
        locator_value = element_info['locator_value']
        timeout = element_info['timeout']



