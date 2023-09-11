# coding: utf-8

"""
    BrowserUp MitmProxy

    ___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 

    The version of the OpenAPI document: 1.0.0
    Contact: developers@browserup.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel, Field, StrictInt, StrictStr, conint

class HarEntryResponseContent(BaseModel):
    """
    HarEntryResponseContent
    """
    size: StrictInt = Field(...)
    compression: Optional[StrictInt] = None
    mime_type: StrictStr = Field(..., alias="mimeType")
    text: Optional[StrictStr] = None
    encoding: Optional[StrictStr] = None
    video_buffered_percent: Optional[conint(strict=True, ge=-1)] = Field(-1, alias="_videoBufferedPercent")
    video_stall_count: Optional[conint(strict=True, ge=-1)] = Field(-1, alias="_videoStallCount")
    video_decoded_byte_count: Optional[conint(strict=True, ge=-1)] = Field(-1, alias="_videoDecodedByteCount")
    video_waiting_count: Optional[conint(strict=True, ge=-1)] = Field(-1, alias="_videoWaitingCount")
    video_error_count: Optional[conint(strict=True, ge=-1)] = Field(-1, alias="_videoErrorCount")
    video_dropped_frames: Optional[conint(strict=True, ge=-1)] = Field(-1, alias="_videoDroppedFrames")
    video_total_frames: Optional[conint(strict=True, ge=-1)] = Field(-1, alias="_videoTotalFrames")
    video_audio_bytes_decoded: Optional[conint(strict=True, ge=-1)] = Field(-1, alias="_videoAudioBytesDecoded")
    comment: Optional[StrictStr] = None
    __properties = ["size", "compression", "mimeType", "text", "encoding", "_videoBufferedPercent", "_videoStallCount", "_videoDecodedByteCount", "_videoWaitingCount", "_videoErrorCount", "_videoDroppedFrames", "_videoTotalFrames", "_videoAudioBytesDecoded", "comment"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> HarEntryResponseContent:
        """Create an instance of HarEntryResponseContent from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> HarEntryResponseContent:
        """Create an instance of HarEntryResponseContent from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return HarEntryResponseContent.parse_obj(obj)

        _obj = HarEntryResponseContent.parse_obj({
            "size": obj.get("size"),
            "compression": obj.get("compression"),
            "mime_type": obj.get("mimeType"),
            "text": obj.get("text"),
            "encoding": obj.get("encoding"),
            "video_buffered_percent": obj.get("_videoBufferedPercent") if obj.get("_videoBufferedPercent") is not None else -1,
            "video_stall_count": obj.get("_videoStallCount") if obj.get("_videoStallCount") is not None else -1,
            "video_decoded_byte_count": obj.get("_videoDecodedByteCount") if obj.get("_videoDecodedByteCount") is not None else -1,
            "video_waiting_count": obj.get("_videoWaitingCount") if obj.get("_videoWaitingCount") is not None else -1,
            "video_error_count": obj.get("_videoErrorCount") if obj.get("_videoErrorCount") is not None else -1,
            "video_dropped_frames": obj.get("_videoDroppedFrames") if obj.get("_videoDroppedFrames") is not None else -1,
            "video_total_frames": obj.get("_videoTotalFrames") if obj.get("_videoTotalFrames") is not None else -1,
            "video_audio_bytes_decoded": obj.get("_videoAudioBytesDecoded") if obj.get("_videoAudioBytesDecoded") is not None else -1,
            "comment": obj.get("comment")
        })
        return _obj


